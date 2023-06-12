import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PortataComponent } from './portata.component';

describe('PortataComponent', () => {
  let component: PortataComponent;
  let fixture: ComponentFixture<PortataComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [PortataComponent]
    });
    fixture = TestBed.createComponent(PortataComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
