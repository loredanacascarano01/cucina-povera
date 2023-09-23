import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CreaMenuComponent } from './crea-menu.component';

describe('CreaMenuComponent', () => {
  let component: CreaMenuComponent;
  let fixture: ComponentFixture<CreaMenuComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [CreaMenuComponent]
    });
    fixture = TestBed.createComponent(CreaMenuComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
